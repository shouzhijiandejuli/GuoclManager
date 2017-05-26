package com.gcl.service;

import com.gcl.model.Organization;
import com.gcl.vo.Tree;

import java.util.List;

/**
 * @description：部门管理
 * @author：guoconglin
 * @date：2017/05/25 14:51
 */
public interface OrganizationService {
    /**
     * 查询部门资源树
     *
     * @return
     */
    List<Tree> findTree();

    /**
     * 查询部门数据表格
     *
     * @return
     */
    List<Organization> findTreeGrid();

    /**
     * 添加部门
     *
     * @param organization
     */
    void addOrganization(Organization organization);

    /**
     * 根据id查找部门
     *
     * @param id
     * @return
     */
    Organization findOrganizationById(Long id);

    /**
     * 更新部门
     *
     * @param organization
     */
    void updateOrganization(Organization organization);

    /**
     * 根据id删除部门
     *
     * @param id
     */
    void deleteOrganizationById(Long id);

}
