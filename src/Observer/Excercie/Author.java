package Observer.Excercie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Author {
    private Map<EventType, List<Subscriber>> subscribers;
    private List<Blog> blogs;
    private List<Post> posts;

    public Author() {
        this.subscribers = new HashMap<>();
        initializeSubscriberEvents();
        this.blogs = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public void initializeSubscriberEvents() {
        subscribers.put(EventType.NEW_BLOG, new ArrayList<>());
        subscribers.put(EventType.NEW_POST, new ArrayList<>());
    }

    public void subscribe(EventType eventType , Subscriber subscriber) {
        subscribers.get(eventType).add(subscriber);
    }

    public void unSubscribe(EventType eventType , Subscriber subscriber) {
        subscribers.get(eventType).remove(subscriber);
    }

    public void addNewPost(Post post) {
        posts.add(post);
        notifySubscribers(EventType.NEW_POST , "new post has been added to the list: " + post.getText());

    }

    public void addNewBlog(Blog blog) {
        blogs.add(blog);
        notifySubscribers(EventType.NEW_BLOG , "new blog has been added to the list: " + blog.getText());
    }


    public void notifySubscribers(EventType eventType , String s) {
        subscribers.get(eventType).forEach(sub -> sub.notify(s));
    }
}
