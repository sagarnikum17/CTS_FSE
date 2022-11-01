import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
    providedIn: 'root'
  })
  export class BookService {
  
    
    private url:string = "http://localhost:9090/api/v1/digitalbooks/books"
    //private url:string =  http://localhost:9090/api/v1/digitalbooks/books/search/?b_name=Ramayan&b_category=Historical&b_auther=Valmiki&b_price=500&b_publisher=Rajgopal
    private findByNameUrl = "http://localhost:9090/api/v1/digitalbooks/books/find/b_name"
    
    constructor(private http:HttpClient) { }
  
     
    fetchBooks(){
      return this.http.get(this.url);
    }
    
    fetchByName(){
      return this.http.get(this.findByNameUrl)
    }
  }