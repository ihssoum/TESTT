import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent {
  bookForm: FormGroup;

  constructor(private fb: FormBuilder, private http: HttpClient) {
    // Initialize the form with empty values and validators
    this.bookForm = this.fb.group({
      author: ['', Validators.required],
      title: ['', Validators.required]
    });
  }

  onSubmit() {
    if (this.bookForm.valid) {
      const bookData = this.bookForm.value; // Get the form values

      this.http.post('http://localhost:8080/AjoutLivre', bookData, { responseType: 'text' })
        .subscribe(response => {
          console.log(response); // This will now log "Book uploaded successfully"
        }, error => {
          console.error('Error:', error);
        });

    } else {
      console.error('Form is invalid');
    }
  }
}
