/*
 * Copyright 2008-2018 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 * FileId: AUVRMXSIprc4PqK71Gy2Q+g2sJDvqnd5
 */
package net.shopxx.service;

import java.util.List;

import net.shopxx.Filter;
import net.shopxx.Order;
import net.shopxx.entity.ProductTag;

/**
 * Service - 商品标签
 * 
 * @author SHOP++ Team
 * @version 6.1
 */
public interface ProductTagService extends BaseService<ProductTag, Long> {

	/**
	 * 查找商品标签
	 * 
	 * @param count
	 *            数量
	 * @param filters
	 *            筛选
	 * @param orders
	 *            排序
	 * @param useCache
	 *            是否使用缓存
	 * @return 商品标签
	 */
	List<ProductTag> findList(Integer count, List<Filter> filters, List<Order> orders, boolean useCache);

}