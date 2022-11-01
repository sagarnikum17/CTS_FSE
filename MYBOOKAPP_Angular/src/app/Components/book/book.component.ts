import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { BookService } from '../services/book.service';
import { Book } from './book';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {

  bookForm:FormGroup;
  books:Array<Book> = []

  constructor(private bookservice:BookService) {

    this.fetchBooks();
    this.fetchByName();

    this.bookForm = new FormGroup(
      {
        b_name: new FormControl("", [Validators.required]),
        b_category: new FormControl("", [Validators.required]),
        b_auther: new FormControl("", [Validators.required]),
        b_price: new FormControl("", [Validators.required]),
        b_publisher: new FormControl("", [Validators.required]),
      }
    )
   }

  ngOnInit(): void {
  }
  fetchBooks(){

    this.bookservice.fetchBooks().subscribe
    ({
      next: (res:any)=>{
          console.log(res);
          this.books = res;
      },
      error: (err:any)=>{
          console.log(err)
      }
  })

  }

  fetchByName(){
    this.bookservice.fetchByName().subscribe
    ({
      next: (res:any)=>{
        console.log(res);
        this.books = res;
    },
    error: (err:any)=>{
        console.log(err)
    }
    }

    )
  }
  // onSubmit(value: any) {
  //   console.log(value);
  //   this.bookSvc.createBook(value).subscribe(data => {
  //     if (data.book_id) {
  //       this.selected = 1
  //       this.fetchAllBooks();
  //     }
}
