import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AddBookComponent} from './add-book/add-book.component';


const routes: Routes = [  { path: '', redirectTo: '/home', pathMatch: 'full' }, // Redirect to '/home' by default
  { path: 'home', component: AddBookComponent },];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
