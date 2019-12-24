package com.jnshu.entity;

import javax.persistence.*;

public class Art {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ����
     */
    private String author;

    /**
     * ��Ʒ����
     */
    private String name;

    /**
     * 0:�¼ܣ�1���ϼ�
     */
    private Boolean state;

    /**
     * ��Ʒ��ģ���Ʒ�����ࣩ����������Ʒ����������ͯ��;�ճ���ʵȶ�������
     */
    @Column(name = "first_id")
    private Long firstId;

    /**
     * ��Ʒ���ͣ����ϻ滭/װ��;Ӱ��/��Ӱ��һ������
     */
    @Column(name = "second_id")
    private Long secondId;

    /**
     * ��Ʒ��飬300������
     */
    private String introduce;

    /**
     * ����ͼ,Ӧ���������Ķ�����Ʒ���ķ���
     */
    @Column(name = "img_second_naill")
    private String imgSecondNaill;

    /**
     * ��Ƶ
     */
    private String video;

    /**
     * �Ƿ�������Ƶ���ӣ�0ͼƬ���ӣ�1��Ƶ����
     */
    @Column(name = "is_link")
    private Boolean isLink;

    /**
     * ��Ʒ����ͼƬ
     */
    @Column(name = "img_detail")
    private String imgDetail;

    /**
     * ���飬�ַ��������ı��༭
     */
    @Column(name = "article_detail")
    private String articleDetail;

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
     * ��ȡ����
     *
     * @return author - ����
     */
    public String getAuthor() {
        return author;
    }

    /**
     * ��������
     *
     * @param author ����
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * ��ȡ��Ʒ����
     *
     * @return name - ��Ʒ����
     */
    public String getName() {
        return name;
    }

    /**
     * ������Ʒ����
     *
     * @param name ��Ʒ����
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * ��ȡ0:�¼ܣ�1���ϼ�
     *
     * @return state - 0:�¼ܣ�1���ϼ�
     */
    public Boolean getState() {
        return state;
    }

    /**
     * ����0:�¼ܣ�1���ϼ�
     *
     * @param state 0:�¼ܣ�1���ϼ�
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    /**
     * ��ȡ��Ʒ��ģ���Ʒ�����ࣩ����������Ʒ����������ͯ��;�ճ���ʵȶ�������
     *
     * @return first_id - ��Ʒ��ģ���Ʒ�����ࣩ����������Ʒ����������ͯ��;�ճ���ʵȶ�������
     */
    public Long getFirstId() {
        return firstId;
    }

    /**
     * ������Ʒ��ģ���Ʒ�����ࣩ����������Ʒ����������ͯ��;�ճ���ʵȶ�������
     *
     * @param firstId ��Ʒ��ģ���Ʒ�����ࣩ����������Ʒ����������ͯ��;�ճ���ʵȶ�������
     */
    public void setFirstId(Long firstId) {
        this.firstId = firstId;
    }

    /**
     * ��ȡ��Ʒ���ͣ����ϻ滭/װ��;Ӱ��/��Ӱ��һ������
     *
     * @return second_id - ��Ʒ���ͣ����ϻ滭/װ��;Ӱ��/��Ӱ��һ������
     */
    public Long getSecondId() {
        return secondId;
    }

    /**
     * ������Ʒ���ͣ����ϻ滭/װ��;Ӱ��/��Ӱ��һ������
     *
     * @param secondId ��Ʒ���ͣ����ϻ滭/װ��;Ӱ��/��Ӱ��һ������
     */
    public void setSecondId(Long secondId) {
        this.secondId = secondId;
    }

    /**
     * ��ȡ��Ʒ��飬300������
     *
     * @return introduce - ��Ʒ��飬300������
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * ������Ʒ��飬300������
     *
     * @param introduce ��Ʒ��飬300������
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    /**
     * ��ȡ����ͼ,Ӧ���������Ķ�����Ʒ���ķ���
     *
     * @return img_second_naill - ����ͼ,Ӧ���������Ķ�����Ʒ���ķ���
     */
    public String getImgSecondNaill() {
        return imgSecondNaill;
    }

    /**
     * ��������ͼ,Ӧ���������Ķ�����Ʒ���ķ���
     *
     * @param imgSecondNaill ����ͼ,Ӧ���������Ķ�����Ʒ���ķ���
     */
    public void setImgSecondNaill(String imgSecondNaill) {
        this.imgSecondNaill = imgSecondNaill == null ? null : imgSecondNaill.trim();
    }

    /**
     * ��ȡ��Ƶ
     *
     * @return video - ��Ƶ
     */
    public String getVideo() {
        return video;
    }

    /**
     * ������Ƶ
     *
     * @param video ��Ƶ
     */
    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
    }

    /**
     * ��ȡ�Ƿ�������Ƶ���ӣ�0ͼƬ���ӣ�1��Ƶ����
     *
     * @return is_link - �Ƿ�������Ƶ���ӣ�0ͼƬ���ӣ�1��Ƶ����
     */
    public Boolean getIsLink() {
        return isLink;
    }

    /**
     * �����Ƿ�������Ƶ���ӣ�0ͼƬ���ӣ�1��Ƶ����
     *
     * @param isLink �Ƿ�������Ƶ���ӣ�0ͼƬ���ӣ�1��Ƶ����
     */
    public void setIsLink(Boolean isLink) {
        this.isLink = isLink;
    }

    /**
     * ��ȡ��Ʒ����ͼƬ
     *
     * @return img_detail - ��Ʒ����ͼƬ
     */
    public String getImgDetail() {
        return imgDetail;
    }

    /**
     * ������Ʒ����ͼƬ
     *
     * @param imgDetail ��Ʒ����ͼƬ
     */
    public void setImgDetail(String imgDetail) {
        this.imgDetail = imgDetail == null ? null : imgDetail.trim();
    }

    /**
     * ��ȡ���飬�ַ��������ı��༭
     *
     * @return article_detail - ���飬�ַ��������ı��༭
     */
    public String getArticleDetail() {
        return articleDetail;
    }

    /**
     * �������飬�ַ��������ı��༭
     *
     * @param articleDetail ���飬�ַ��������ı��༭
     */
    public void setArticleDetail(String articleDetail) {
        this.articleDetail = articleDetail == null ? null : articleDetail.trim();
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