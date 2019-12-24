package com.jnshu.entity;

import javax.persistence.*;

public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * �ֲ�ͼ��ת����
     */
    private String url;

    /**
     * ��ͼ����
     */
    private String img;

    /**
     * ״̬��0���ݸ壬1������
     */
    private Boolean state;

    /**
     * ����
     */
    private Long sort;

    /**
     * ���ͣ�ʲô�����ٿ�������
     */
    private Boolean type;

    /**
     * ������
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
     * ��ȡ�ֲ�ͼ��ת����
     *
     * @return url - �ֲ�ͼ��ת����
     */
    public String getUrl() {
        return url;
    }

    /**
     * �����ֲ�ͼ��ת����
     *
     * @param url �ֲ�ͼ��ת����
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * ��ȡ��ͼ����
     *
     * @return img - ��ͼ����
     */
    public String getImg() {
        return img;
    }

    /**
     * ������ͼ����
     *
     * @param img ��ͼ����
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * ��ȡ״̬��0���ݸ壬1������
     *
     * @return state - ״̬��0���ݸ壬1������
     */
    public Boolean getState() {
        return state;
    }

    /**
     * ����״̬��0���ݸ壬1������
     *
     * @param state ״̬��0���ݸ壬1������
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    /**
     * ��ȡ����
     *
     * @return sort - ����
     */
    public Long getSort() {
        return sort;
    }

    /**
     * ��������
     *
     * @param sort ����
     */
    public void setSort(Long sort) {
        this.sort = sort;
    }

    /**
     * ��ȡ���ͣ�ʲô�����ٿ�������
     *
     * @return type - ���ͣ�ʲô�����ٿ�������
     */
    public Boolean getType() {
        return type;
    }

    /**
     * �������ͣ�ʲô�����ٿ�������
     *
     * @param type ���ͣ�ʲô�����ٿ�������
     */
    public void setType(Boolean type) {
        this.type = type;
    }

    /**
     * ��ȡ������
     *
     * @return create_by - ������
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * ���ô�����
     *
     * @param createBy ������
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