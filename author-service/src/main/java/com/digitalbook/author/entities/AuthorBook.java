package com.digitalbook.author.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "book")
public class AuthorBook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "b_id")
	private int a_bookid;
	
	@Column(name = "a_id")
	private int a_id;
	
	@Column(name = "b_name")
	private String a_name;
	
	@Column(name = "b_category")
	private String a_category;
	
	@Column(name = "b_auther")
	private String a_author;
	
	@Column(name = "b_price")
	private double a_price;
	
	@Column(name = "b_publisher")
	private String a_publisher;
	
	@Column(name = "b_publishdate")
	private String a_publishdate;
	
	@Column(name = "b_isblock")
	private boolean a_isblock;
	
	
	public boolean isA_isblock() {
		return a_isblock;
	}
	public void setA_isblock(boolean a_isblock) {
		this.a_isblock = a_isblock;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public int getA_bookid() {
		return a_bookid;
	}
	public void setA_bookid(int a_bookid) {
		this.a_bookid = a_bookid;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public String getA_category() {
		return a_category;
	}
	
	public void setA_category(String a_category) {
		this.a_category = a_category;
	}
	
	public String getA_author() {
		return a_author;
	}
	public void setA_author(String a_author) {
		this.a_author = a_author;
	}
	public double getA_price() {
		return a_price;
	}
	public void setA_price(double a_price) {
		this.a_price = a_price;
	}
	public String getA_publisher() {
		return a_publisher;
	}
	public void setA_publisher(String a_publisher) {
		this.a_publisher = a_publisher;
	}
	
	public String getA_publishdate() {
		return a_publishdate;
	}
	public void setA_publishdate(String a_publishdate) {
		this.a_publishdate = a_publishdate;
	}
	
	public AuthorBook( int a_id, String a_name, String a_category, String a_author, double a_price, String a_publisher, String a_publishdate, boolean a_isblock) {
		super();
		this.a_id = a_id;
		this.a_name = a_name;
		this.a_category = a_category;
		this.a_author = a_author;
		this.a_price = a_price;
		this.a_publisher = a_publisher;
		this.a_publishdate = a_publishdate;
		this.a_isblock = a_isblock;
	}
	
	public AuthorBook(int a_bookid, int a_id, String a_name, String a_category, String a_author, double a_price, String a_publisher, String a_publishdate, boolean a_isblock)
	{
		this(a_id,a_name,a_category,a_author,a_price,a_publisher,a_publishdate,a_isblock);
		this.a_bookid = a_bookid;
	}

	
	
	@Override
	public String toString() {
		return "AuthorBook [a_bookid=" + a_bookid + ", a_id=" + a_id + ", a_name=" + a_name + ", a_category="
				+ a_category + ", a_author=" + a_author + ", a_price=" + a_price + ", a_publisher=" + a_publisher
				+ ", a_publishdate=" + a_publishdate + ", a_isblock=" + a_isblock + "]";
	}
	public AuthorBook()
	{
		
	}
	
	}
	
	

