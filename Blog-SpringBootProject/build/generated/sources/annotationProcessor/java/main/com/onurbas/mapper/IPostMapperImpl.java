package com.onurbas.mapper;

import com.onurbas.dto.request.PostRequestDTO;
import com.onurbas.dto.response.PostResponseDTO;
import com.onurbas.model.Category;
import com.onurbas.model.Post;
import com.onurbas.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-19T21:25:19+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.1.jar, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class IPostMapperImpl implements IPostMapper {

    @Override
    public PostResponseDTO postToPostDTO(Post post) {
        if ( post == null ) {
            return null;
        }

        PostResponseDTO.PostResponseDTOBuilder postResponseDTO = PostResponseDTO.builder();

        postResponseDTO.userId( postUserId( post ) );
        postResponseDTO.categoryId( postCategoryId( post ) );
        postResponseDTO.id( post.getId() );
        postResponseDTO.title( post.getTitle() );
        postResponseDTO.content( post.getContent() );
        postResponseDTO.date( post.getDate() );

        return postResponseDTO.build();
    }

    @Override
    public List<PostResponseDTO> postListToPostDTOList(List<Post> postList) {
        if ( postList == null ) {
            return null;
        }

        List<PostResponseDTO> list = new ArrayList<PostResponseDTO>( postList.size() );
        for ( Post post : postList ) {
            list.add( postToPostDTO( post ) );
        }

        return list;
    }

    @Override
    public Post postDTOToPost(PostResponseDTO postResponseDTO) {
        if ( postResponseDTO == null ) {
            return null;
        }

        Post.PostBuilder post = Post.builder();

        post.user( postResponseDTOToUser( postResponseDTO ) );
        post.category( postResponseDTOToCategory( postResponseDTO ) );
        post.id( postResponseDTO.getId() );
        post.title( postResponseDTO.getTitle() );
        post.content( postResponseDTO.getContent() );
        post.date( postResponseDTO.getDate() );

        return post.build();
    }

    @Override
    public Post postRequestDTOToPost(PostRequestDTO postRequestDTO) {
        if ( postRequestDTO == null ) {
            return null;
        }

        Post.PostBuilder post = Post.builder();

        post.id( postRequestDTO.getId() );
        post.title( postRequestDTO.getTitle() );
        post.content( postRequestDTO.getContent() );

        return post.build();
    }

    @Override
    public PostRequestDTO postToPostRequestDTO(Post post) {
        if ( post == null ) {
            return null;
        }

        PostRequestDTO.PostRequestDTOBuilder postRequestDTO = PostRequestDTO.builder();

        postRequestDTO.id( post.getId() );
        postRequestDTO.title( post.getTitle() );
        postRequestDTO.content( post.getContent() );

        return postRequestDTO.build();
    }

    @Override
    public List<Post> postDTOListToPostList(List<PostResponseDTO> postResponseDTOList) {
        if ( postResponseDTOList == null ) {
            return null;
        }

        List<Post> list = new ArrayList<Post>( postResponseDTOList.size() );
        for ( PostResponseDTO postResponseDTO : postResponseDTOList ) {
            list.add( postDTOToPost( postResponseDTO ) );
        }

        return list;
    }

    private Long postUserId(Post post) {
        if ( post == null ) {
            return null;
        }
        User user = post.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long postCategoryId(Post post) {
        if ( post == null ) {
            return null;
        }
        Category category = post.getCategory();
        if ( category == null ) {
            return null;
        }
        Long id = category.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected User postResponseDTOToUser(PostResponseDTO postResponseDTO) {
        if ( postResponseDTO == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( postResponseDTO.getUserId() );

        return user.build();
    }

    protected Category postResponseDTOToCategory(PostResponseDTO postResponseDTO) {
        if ( postResponseDTO == null ) {
            return null;
        }

        Category.CategoryBuilder category = Category.builder();

        category.id( postResponseDTO.getCategoryId() );

        return category.build();
    }
}
