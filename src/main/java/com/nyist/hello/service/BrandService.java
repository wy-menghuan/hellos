package com.nyist.hello.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.nyist.hello.pojo.TbBrand;


import entity.PageResult;

/**
 * 品牌接口
 * @author Administrator
 *
 */
public interface BrandService {

	/**
	 * 
	 * 查询品牌列表
	 * @return
	 */
	public List<TbBrand> findAll();
	
	/**
	 * 品牌分页
	 * @param pageNum 当前页面
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	/**
	 * 
	 * 增加
	 * @param brand
	 */
	
	public void add(TbBrand brand);
	
	/**
	 * 
	 * 根据id查询实体
	 * @param id
	 * @return
	 */
	public TbBrand findOne(Long id);
	
	/**
	 * 修改
	 * @param brand
	 */
	public void update(TbBrand brand);
	
	/**
	 * 删除
	 * @param ids
	 */
	public void delete(Long[] ids);
	
	
	/**
	 * 品牌分页
	 * @param pageNum 当前页面
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbBrand brand,int pageNum,int pageSize);
	
	
	
	

	
	
	
}
