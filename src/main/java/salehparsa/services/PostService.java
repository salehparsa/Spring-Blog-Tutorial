package salehparsa.services;
import salehparsa.models.Post;
import java.util.List;

/**
 * Created by saleh on 9/7/16.
 * This interface provides logic for working with posts in this blog engine
 */
public interface PostService {
    List<Post> findAll();
    List<Post> findLatest5();
    Post findById(Long id);
    Post create(Post post);
    Post edit(Post post);
    void deleteById(Long id);
}
