import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
//import { BookComponent } from './Components/book/book.component';
import { HeaderComponent } from './Components/header/header.component';
import { FooterComponent } from './Components/footer/footer.component';
import { AuthorComponent } from './Components/author/author.component';
import { HomeComponent } from './Components/home/home.component';
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { Route, RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { BookComponent } from './Components/book/book.component';


const routes: Routes =[
  // { path: "home", component: HomeComponent },
  // { path: "back", component: HomeComponent}
  
  
];
            
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    BookComponent,
    HeaderComponent,
    FooterComponent,
    AuthorComponent
    
  ],
  imports: [
    FormsModule,
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    RouterModule.forRoot(routes),
    HttpClientModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
