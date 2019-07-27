package com.meatball.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PageInfo<T> implements Serializable {

    long totalElements;

    private List<T> content;

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public List<T> getContent() {
        return content;
    }

    public PageInfo(List<T> list) {
        if(list != null){
            totalElements = list.size();
            content = list;
        }else {
            totalElements=0;
        }
    }

    public PageInfo(PageEntity page,List<T> list) {

        // 当前页
        Integer pageNum = 1;

        //每页的数量
        Integer pageSize = 10;

        if(page != null){
            if(page.getPageNum() != null){
                pageNum = page.getPageNum();
            }

            if(page.getPageSize() != null){
                pageSize = page.getPageSize();
            }
            pageNum = pageNum<1? 1:pageNum;
        }

        // 总条数
        Integer total = 0;
        if(list != null){
            total = list.size();
        }

        //当前页的数量
        Integer size = 0;

        int j = total-(pageNum-1) * pageSize;

        if(j >= 0){
            size =pageSize < j?pageSize:j;
        }

        if(size==0) {
            //结果集
            this.content = null;
        }else if(size>= total){
            this.content = list;
        }else {
            this.content = new ArrayList<>();
            for (int i =(pageNum-1) * pageSize;i<(pageNum-1) * pageSize+size; i++ ){
                this.content.add(list.get(i));
            }
        }
        this.totalElements = total;
    }
}
