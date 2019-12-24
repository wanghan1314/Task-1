package com.jnshu.entity;

import javax.persistence.*;

public class First {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * һ����Ʒ������
     */
    private String name;

    /**
     * ���¼�״̬
     */
    private Boolean status;

    /**
     * �������
     */
    private Boolean sort;

    /**
     * ��˭����
     */
    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_at")
    private Long createAt;

    /**
     * �༭��
     */
    @Column(name = "update_by")
    private String updateBy;

    @Column(name = "update_at")
    private Long updateAt;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡһ����Ʒ������
     *
     * @return name - һ����Ʒ������
     */
    public String getName() {
        return name;
    }

    /**
     * ����һ����Ʒ������
     *
     * @param name һ����Ʒ������
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * ��ȡ���¼�״̬
     *
     * @return status - ���¼�״̬
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * �������¼�״̬
     *
     * @param status ���¼�״̬
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * ��ȡ�������
     *
     * @return sort - �������
     */
    public Boolean getSort() {
        return sort;
    }

    /**
     * �����������
     *
     * @param sort �������
     */
    public void setSort(Boolean sort) {
        this.sort = sort;
    }

    /**
     * ��ȡ��˭����
     *
     * @return create_by - ��˭����
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * ���ñ�˭����
     *
     * @param createBy ��˭����
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * @return create_at
     */
    public Long getCreateAt() {
        return createAt;
    }

    /**
     * @param createAt
     */
    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    /**
     * ��ȡ�༭��
     *
     * @return update_by - �༭��
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * ���ñ༭��
     *
     * @param updateBy �༭��
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * @return update_at
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    /**
     * @param updateAt
     */
    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }
}