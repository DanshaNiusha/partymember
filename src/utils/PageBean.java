package utils;

import java.io.Serializable;
import java.util.List;

/**
 *  分页的工具类
 */
public class PageBean<T> implements Serializable {

    // 分页查询的数据(查询数据库)
    private List<T> rows;

    // 总页码数(计算) 【total pageSize】
    private int totalPage;

    // 起始索引(计算) 【pageNumber pageSize】
    private int startIndex;

    // 每页显示大小(固定写死的)
    private int pageSize;

    // 要查看的页码(前台页面传递)
    private int pageNumber;

    // 总记录数(查询)
    private int total;

    public PageBean() {

    }

    //////////////////////////////////////////////////////////
    public PageBean(int pageSize, int pageNumber, int total) {
        // 计算总页码数
        this.totalPage = (total%pageSize==0)?(total/pageSize):(total/pageSize+1);
        // 计算起始索引
        this.startIndex=(pageNumber-1)*pageSize;
        // 其它属性赋值
        this.pageSize = pageSize;
        this.pageNumber=pageNumber;
        this.total = total;
    }

    //////////////////////////////////////////////////////////

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
