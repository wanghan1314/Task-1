package com.jnshu.entity;

import javax.persistence.*;

public class Second {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ����һ����Ʒ��id
     */
    @Column(name = "first_id")
    private Long firstId;

    /**
     * ����һ����Ʒ������
     */
    @Column(name = "first_name")
    private String firstName;

    /**
     * ������Ʒ������
     */
    private String name;

    /**
     * ���¼�״̬
     */
    private Boolean status;

    @Column(name = "create_at")
    private Long createAt;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "update_at")
    private Long updateAt;

    @Column(name = "update_by")
    private String updateBy;

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
     * ��ȡ����һ����Ʒ��id
     *
     * @return first_id - ����һ����Ʒ��id
     */
    public Long getFirstId() {
        return firstId;
    }

    /**
     * ��������һ����Ʒ��id
     *
     * @param firstId ����һ����Ʒ��id
     */
    public void setFirstId(Long firstId) {
        this.firstId = firstId;
    }

    /**
     * ��ȡ����һ����Ʒ������
     *
     * @return first_name - ����һ����Ʒ������
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * ��������һ����Ʒ������
     *
     * @param firstName ����һ����Ʒ������
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * ��ȡ������Ʒ������
     *
     * @return name - ������Ʒ������
     */
    public String getName() {
        return name;
    }

    /**
     * ���ö�����Ʒ������
     *
     * @param name ������Ʒ������
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
     * @return create_by
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
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

    /**
     * @return update_by
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }
}