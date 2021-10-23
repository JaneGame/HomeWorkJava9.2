package ru.netology.post;

import ru.netology.source.PostSource;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private String text;
    private int date;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
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

    public int getId() {
        return id;
    }

    public Post setId(int id) {
        this.id = id;
        return this;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public Post setOwnerId(int ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public int getFromId() {
        return fromId;
    }

    public Post setFromId(int fromId) {
        this.fromId = fromId;
        return this;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public Post setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
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

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public Post setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
        return this;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public Post setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
        return this;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public Post setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
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

    public PostSource getPostSource() {
        return postSource;
    }

    public Post setPostSource(PostSource postSource) {
        this.postSource = postSource;
        return this;
    }
}
