import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FormControl} from '@angular/forms';

@Component({
  selector: 'app-kata-for-fun-form',
  templateUrl: './kata-for-fun-form.component.html'
})
export class KataForFunFormComponent implements OnInit {
  @Output()
  submitNumberOutput: EventEmitter<number> = new EventEmitter<number>();

  inputField = new FormControl('');


  constructor() {

  }

  ngOnInit(): void {
  }

  submitNumber(): void {
    this.submitNumberOutput.emit(this.inputField.value);
  }

  isInputFieldValid(): boolean {
    return this.inputField.value === '' || this.inputField.value === null;
  }
}
