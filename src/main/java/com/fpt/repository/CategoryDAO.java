package com.fpt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.fpt.entity.Category;
import com.fpt.entity.CategoryMap;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
@Repository
public class CategoryDAO {
	RestTemplate rest = new RestTemplate();
	String url = "https://java6-fpoly-eaf71-default-rtdb.firebaseio.com/Category.json";

	private String getUrl(String key) {
		return url.replace(".json", "/" + key + ".json");
	}

	public CategoryMap findAll() {
		return rest.getForObject(url, CategoryMap.class);
	}

	public Category findByKey(String key) {
		return rest.getForObject(getUrl(key), Category.class);
	}
	public String create(Category data) {
		HttpEntity<Category> entity = new HttpEntity<>(data);
		JsonNode resp = rest.postForObject(url, entity, JsonNode.class);
		return resp.get("name").asText();
	}
	public Category update(String key, Category data) {
		rest.put(getUrl(key), data);
		return data;
	}
	public void delete(String key) {
		rest.delete(getUrl(key));
	}
}
/*
 * public interface CategoryDAO extends JpaRepository<Category, Integer> {
 * 
 * @Query("SELECT new ReportInventoryByCategory(product.category, sum(product.price), count(product)) "
 * + "FROM Product product " + "GROUP BY product.category " +
 * "ORDER BY sum(product.price) DESC") List<ReportInventoryByCategory>
 * getInventoryByCategory(); }
 */
