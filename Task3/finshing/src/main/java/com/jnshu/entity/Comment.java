package com.jnshu.entity;

import javax.persistence.*;

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * (�û��ǳƻ��������ǳ�,�¼�),json�ļ�,ǰ�˴��θ����.
     */
    private String nick;

    /**
     * ��Ʒid
     */
    @Column(name = "art_id")
    private Long artId;

    /**
     * ����Ҫ�ظ�������id
     */
    @Column(name = "reply_id")
    private Long replyId;

    /**
     * �û����ԣ�0���������ԣ�1���û�����
     */
    private Boolean type;

    /**
     * �������ݣ�����emoji����
     */
    private String content;

    /**
     * ���Է��࣬�Ƿ�ѡ
     */
    private Boolean selection;

    /**
     * ���Դ�����
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * ����/�ظ�ʱ��
     */
    @Column(name = "create_at")
    private Long createAt;

    /**
     * ����ʱ��
     */
    @Column(name = "update_at")
    private Long updateAt;

    /**
     * ����������
     */
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
     * ��ȡ(�û��ǳƻ��������ǳ�,�¼�),json�ļ�,ǰ�˴��θ����.
     *
     * @return nick - (�û��ǳƻ��������ǳ�,�¼�),json�ļ�,ǰ�˴��θ����.
     */
    public String getNick() {
        return nick;
    }

    /**
     * ����(�û��ǳƻ��������ǳ�,�¼�),json�ļ�,ǰ�˴��θ����.
     *
     * @param nick (�û��ǳƻ��������ǳ�,�¼�),json�ļ�,ǰ�˴��θ����.
     */
    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    /**
     * ��ȡ��Ʒid
     *
     * @return art_id - ��Ʒid
     */
    public Long getArtId() {
        return artId;
    }

    /**
     * ������Ʒid
     *
     * @param artId ��Ʒid
     */
    public void setArtId(Long artId) {
        this.artId = artId;
    }

    /**
     * ��ȡ����Ҫ�ظ�������id
     *
     * @return reply_id - ����Ҫ�ظ�������id
     */
    public Long getReplyId() {
        return replyId;
    }

    /**
     * ��������Ҫ�ظ�������id
     *
     * @param replyId ����Ҫ�ظ�������id
     */
    public void setReplyId(Long replyId) {
        this.replyId = replyId;
    }

    /**
     * ��ȡ�û����ԣ�0���������ԣ�1���û�����
     *
     * @return type - �û����ԣ�0���������ԣ�1���û�����
     */
    public Boolean getType() {
        return type;
    }

    /**
     * �����û����ԣ�0���������ԣ�1���û�����
     *
     * @param type �û����ԣ�0���������ԣ�1���û�����
     */
    public void setType(Boolean type) {
        this.type = type;
    }

    /**
     * ��ȡ�������ݣ�����emoji����
     *
     * @return content - �������ݣ�����emoji����
     */
    public String getContent() {
        return content;
    }

    /**
     * �����������ݣ�����emoji����
     *
     * @param content �������ݣ�����emoji����
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * ��ȡ���Է��࣬�Ƿ�ѡ
     *
     * @return selection - ���Է��࣬�Ƿ�ѡ
     */
    public Boolean getSelection() {
        return selection;
    }

    /**
     * �������Է��࣬�Ƿ�ѡ
     *
     * @param selection ���Է��࣬�Ƿ�ѡ
     */
    public void setSelection(Boolean selection) {
        this.selection = selection;
    }

    /**
     * ��ȡ���Դ�����
     *
     * @return create_by - ���Դ�����
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * �������Դ�����
     *
     * @param createBy ���Դ�����
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * ��ȡ����/�ظ�ʱ��
     *
     * @return create_at - ����/�ظ�ʱ��
     */
    public Long getCreateAt() {
        return createAt;
    }

    /**
     * ��������/�ظ�ʱ��
     *
     * @param createAt ����/�ظ�ʱ��
     */
    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return update_at - ����ʱ��
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    /**
     * ���ø���ʱ��
     *
     * @param updateAt ����ʱ��
     */
    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * ��ȡ����������
     *
     * @return update_by - ����������
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * ���ø���������
     *
     * @param updateBy ����������
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }
}