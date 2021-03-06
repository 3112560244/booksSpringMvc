package com.qx.dao;

import com.qx.pojo.Books;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {
    int addBook(Books books);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBook();
}
