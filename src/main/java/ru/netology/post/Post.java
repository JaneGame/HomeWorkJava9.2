package ru.netology.post;

import ru.netology.source.PostSource;

public class Post {
    private int id;
    private int owner_id;
    private int from_id;
    private int created_by;
    private String text;
    private int date;
    private int reply_owner_id;
    private int reply_post_id;
    private boolean friends_only;
    private String postType;
    private String signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postponedId;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private Donut donut;
    private Geo geo;
    private LikesInfo likesInfo;
    private Placeholder placeholder;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private PostSource postSource;

    public PostSource getPostSource() {
        return postSource;
    }

    public Post setPostSource(PostSource postSource) {
        this.postSource = postSource;
        return this;
    }

    public int getId() {
        return id;
    }

    public Post setId(int id) {
        this.id = id;
        return this;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public Post setOwner_id(int owner_id) {
        this.owner_id = owner_id;
        return this;
    }

    public int getFrom_id() {
        return from_id;
    }

    public Post setFrom_id(int from_id) {
        this.from_id = from_id;
        return this;
    }

    public int getCreated_by() {
        return created_by;
    }

    public Post setCreated_by(int created_by) {
        this.created_by = created_by;
        return this;
    }

    public String getText() {
        return text;
    }

    public Post setText(String text) {
        this.text = text;
        return this;
    }

    public int getDate() {
        return date;
    }

    public Post setDate(int date) {
        this.date = date;
        return this;
    }

    public int getReply_owner_id() {
        return reply_owner_id;
    }

    public Post setReply_owner_id(int reply_owner_id) {
        this.reply_owner_id = reply_owner_id;
        return this;
    }

    public int getReply_post_id() {
        return reply_post_id;
    }

    public Post setReply_post_id(int reply_post_id) {
        this.reply_post_id = reply_post_id;
        return this;
    }

    public boolean isFriends_only() {
        return friends_only;
    }

    public Post setFriends_only(boolean friends_only) {
        this.friends_only = friends_only;
        return this;
    }

    public String getPostType() {
        return postType;
    }

    public Post setPostType(String postType) {
        this.postType = postType;
        return this;
    }

    public String getSignerId() {
        return signerId;
    }

    public Post setSignerId(String signerId) {
        this.signerId = signerId;
        return this;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public Post setCanPin(boolean canPin) {
        this.canPin = canPin;
        return this;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public Post setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public Post setPinned(boolean pinned) {
        isPinned = pinned;
        return this;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public Post setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
        return this;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public Post setFavorite(boolean favorite) {
        isFavorite = favorite;
        return this;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public Post setPostponedId(int postponedId) {
        this.postponedId = postponedId;
        return this;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public Post setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
        return this;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public Post setCopyright(Copyright copyright) {
        this.copyright = copyright;
        return this;
    }

    public Donut getDonut() {
        return donut;
    }

    public Post setDonut(Donut donut) {
        this.donut = donut;
        return this;
    }

    public Geo getGeo() {
        return geo;
    }

    public Post setGeo(Geo geo) {
        this.geo = geo;
        return this;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public Post setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
        return this;
    }

    public Placeholder getPlaceholder() {
        return placeholder;
    }

    public Post setPlaceholder(Placeholder placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public Post setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
        return this;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public Post setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
        return this;
    }
}
