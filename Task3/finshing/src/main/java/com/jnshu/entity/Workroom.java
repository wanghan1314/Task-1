package com.jnshu.entity;

import javax.persistence.*;

public class Workroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ����������
     */
    private String name;

    /**
     * ������ͣ�0�������Ҽ�飬1�������Ҽ�飬2����Ա���
     */
    private Boolean type;

    /**
     * ���¼�״̬0���¼ܣ�1���ϼ�
     */
    private Boolean status;

    /**
     * ���ģ����ı��༭
     */
    private String context;

    /**
     * img1��img2��img3����ͼƬ
     */
    private String img1;

    private String img2;

    private String img3;

    /**
     * �����ұ�˭����
     */
    @Column(name = "create_by")
    private String createBy;

    @Column(name = "create_at")
    private Long createAt;

    /**
     * �����ұ�˭����
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
     * ��ȡ����������
     *
     * @return name - ����������
     */
    public String getName() {
        return name;
    }

    /**
     * ���ù���������
     *
     * @param name ����������
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * ��ȡ������ͣ�0�������Ҽ�飬1�������Ҽ�飬2����Ա���
     *
     * @return type - ������ͣ�0�������Ҽ�飬1�������Ҽ�飬2����Ա���
     */
    public Boolean getType() {
        return type;
    }

    /**
     * ���ü�����ͣ�0�������Ҽ�飬1�������Ҽ�飬2����Ա���
     *
     * @param type ������ͣ�0�������Ҽ�飬1�������Ҽ�飬2����Ա���
     */
    public void setType(Boolean type) {
        this.type = type;
    }

    /**
     * ��ȡ���¼�״̬0���¼ܣ�1���ϼ�
     *
     * @return status - ���¼�״̬0���¼ܣ�1���ϼ�
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * �������¼�״̬0���¼ܣ�1���ϼ�
     *
     * @param status ���¼�״̬0���¼ܣ�1���ϼ�
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * ��ȡ���ģ����ı��༭
     *
     * @return context - ���ģ����ı��༭
     */
    public String getContext() {
        return context;
    }

    /**
     * �������ģ����ı��༭
     *
     * @param context ���ģ����ı��༭
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * ��ȡimg1��img2��img3����ͼƬ
     *
     * @return img1 - img1��img2��img3����ͼƬ
     */
    public String getImg1() {
        return img1;
    }

    /**
     * ����img1��img2��img3����ͼƬ
     *
     * @param img1 img1��img2��img3����ͼƬ
     */
    public void setImg1(String img1) {
        this.img1 = img1 == null ? null : img1.trim();
    }

    /**
     * @return img2
     */
    public String getImg2() {
        return img2;
    }

    /**
     * @param img2
     */
    public void setImg2(String img2) {
        this.img2 = img2 == null ? null : img2.trim();
    }

    /**
     * @return img3
     */
    public String getImg3() {
        return img3;
    }

    /**
     * @param img3
     */
    public void setImg3(String img3) {
        this.img3 = img3 == null ? null : img3.trim();
    }

    /**
     * ��ȡ�����ұ�˭����
     *
     * @return create_by - �����ұ�˭����
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * ���ù����ұ�˭����
     *
     * @param createBy �����ұ�˭����
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
     * ��ȡ�����ұ�˭����
     *
     * @return update_by - �����ұ�˭����
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * ���ù����ұ�˭����
     *
     * @param updateBy �����ұ�˭����
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