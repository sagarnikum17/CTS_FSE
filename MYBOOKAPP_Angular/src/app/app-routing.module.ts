import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthorComponent } from './Components/author/author.component';
import { HomeComponent } from './Components/home/home.component';
import { BookComponent } from './Components/book/book.component';
import { ReactiveFormsModule } from '@angular/forms';

const routes: Routes = [
  { path: "home", component: HomeComponent },
  { path: "back",component: HomeComponent},
  { path: "book", component: BookComponent},
  

  { path: "author", component: AuthorComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
