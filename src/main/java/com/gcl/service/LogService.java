package com.gcl.service;

import com.gcl.model.SysLog;
import com.gcl.utils.PageInfo;

/**
 * @description：操作日志
 * @author：guoconglin
 * @date：2017/05/26 10:35
 */
public interface LogService {

    void insertLog(SysLog sysLog);

    void findDataGrid(PageInfo pageInfo);
}
