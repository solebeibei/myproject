package com.liyang.web.aop;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by liyang21 on 2017/9/20.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    private DataSourceSwitcher switcher;

    @Override
    protected Object determineCurrentLookupKey() {
        return switcher.getDataSource();
    }

    public DataSourceSwitcher getSwitcher() {
        return switcher;
    }

    public void setSwitcher(DataSourceSwitcher switcher) {
        this.switcher = switcher;
    }
}
