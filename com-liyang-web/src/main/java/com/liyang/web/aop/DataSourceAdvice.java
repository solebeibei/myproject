package com.liyang.web.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by liyang21 on 2017/9/20.
 */
public class DataSourceAdvice implements MethodBeforeAdvice, AfterReturningAdvice {

    private DataSourceSwitcher switcher;

//    private Logger logger = Logger.getLogger(DataSourceAdvice.class);

    private List<String> readMethodNames;

    public List<String> getReadMethodNames() {
        return readMethodNames;
    }

    public void setReadMethodNames(List<String> readMethodNames) {
        this.readMethodNames = readMethodNames;
    }

    /**
     * before calling the service method, automatically switching data source
     */
    public void before(Method method, Object[] args, Object target)
            throws Throwable {
        if (isReadMethod(method.getName())) {
            switcher.setSlave();
        } else {
            switcher.setMaster();
        }
//        if (logger.isDebugEnabled()) {
//            logger.debug(MessageFormat.format(
//                    "Point cut: {0}-{1} switch data source to {2}",
//                    target.getClass().getName(), method.getName(), switcher.getDataSource()));
//        }
    }

    /**
     * @param methodName
     * @return
     */
    private boolean isReadMethod(String methodName) {
        for (String name : readMethodNames) {
            if (methodName.startsWith(name)) {
                return true;
            }
        }
        return false;
    }

    public void afterReturning(Object arg0, Method method, Object[] args,
                               Object target) throws Throwable {
    }

    /**
     * @param method
     * @param args
     * @param target
     * @param e
     * @throws Throwable
     */
    public void afterThrowing(Method method, Object[] args, Object target,
                              Exception e) throws Throwable {
        if (e instanceof java.sql.SQLException) {
//            logger.error("Occur error, will switch to master datasource");
//            logger.error(e, e);
            switcher.setMaster();
        }
    }

    public DataSourceSwitcher getSwitcher() {
        return switcher;
    }

    public void setSwitcher(DataSourceSwitcher switcher) {
        this.switcher = switcher;
    }
}
