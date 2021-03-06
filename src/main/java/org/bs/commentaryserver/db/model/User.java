package org.bs.commentaryserver.db.model;

public class User
{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_wechat_name
     *
     * @mbggenerated
     */
    private String userWechatName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_phone
     *
     * @mbggenerated
     */
    private String userPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.user_desc
     *
     * @mbggenerated
     */
    private String userDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_id
     *
     * @return the value of t_user.user_id
     * @mbggenerated
     */
    public Integer getUserId()
    {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_id
     *
     * @param userId the value for t_user.user_id
     * @mbggenerated
     */
    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_wechat_name
     *
     * @return the value of t_user.user_wechat_name
     * @mbggenerated
     */
    public String getUserWechatName()
    {
        return userWechatName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_wechat_name
     *
     * @param userWechatName the value for t_user.user_wechat_name
     * @mbggenerated
     */
    public void setUserWechatName(String userWechatName)
    {
        this.userWechatName = userWechatName == null ? null : userWechatName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_phone
     *
     * @return the value of t_user.user_phone
     * @mbggenerated
     */
    public String getUserPhone()
    {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_phone
     *
     * @param userPhone the value for t_user.user_phone
     * @mbggenerated
     */
    public void setUserPhone(String userPhone)
    {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.user_desc
     *
     * @return the value of t_user.user_desc
     * @mbggenerated
     */
    public String getUserDesc()
    {
        return userDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.user_desc
     *
     * @param userDesc the value for t_user.user_desc
     * @mbggenerated
     */
    public void setUserDesc(String userDesc)
    {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }
}