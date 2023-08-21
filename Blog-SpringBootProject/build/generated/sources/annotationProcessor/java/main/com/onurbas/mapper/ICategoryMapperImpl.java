package com.onurbas.mapper;

import com.onurbas.dto.CategoryDTO;
import com.onurbas.model.Category;
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
public class ICategoryMapperImpl implements ICategoryMapper {

    @Override
    public CategoryDTO categoryToCategoryDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryDTO.CategoryDTOBuilder categoryDTO = CategoryDTO.builder();

        categoryDTO.id( category.getId() );
        categoryDTO.categoryName( category.getCategoryName() );
        categoryDTO.description( category.getDescription() );

        return categoryDTO.build();
    }

    @Override
    public List<CategoryDTO> categoryListToCategoryDTOList(List<Category> category) {
        if ( category == null ) {
            return null;
        }

        List<CategoryDTO> list = new ArrayList<CategoryDTO>( category.size() );
        for ( Category category1 : category ) {
            list.add( categoryToCategoryDTO( category1 ) );
        }

        return list;
    }

    @Override
    public Category categoryDTOToCategory(CategoryDTO categoryDTO) {
        if ( categoryDTO == null ) {
            return null;
        }

        Category.CategoryBuilder category = Category.builder();

        category.id( categoryDTO.getId() );
        category.categoryName( categoryDTO.getCategoryName() );
        category.description( categoryDTO.getDescription() );

        return category.build();
    }

    @Override
    public List<Category> categoryDTOListToCategoryList(List<CategoryDTO> categoryDTOList) {
        if ( categoryDTOList == null ) {
            return null;
        }

        List<Category> list = new ArrayList<Category>( categoryDTOList.size() );
        for ( CategoryDTO categoryDTO : categoryDTOList ) {
            list.add( categoryDTOToCategory( categoryDTO ) );
        }

        return list;
    }
}
