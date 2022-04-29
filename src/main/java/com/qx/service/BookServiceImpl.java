package com.qx.service;

import com.qx.dao.BookMapper;
import com.qx.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 31125
 */
@Service
public class BookServiceImpl implements BookService{

    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public void sss(){
        System.out.println("1111111111111");
    }
}
