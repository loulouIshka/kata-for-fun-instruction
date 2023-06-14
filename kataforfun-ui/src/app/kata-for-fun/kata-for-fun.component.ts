import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { KataForFunService } from '../kata-for-fun.service';

@Component({
  selector: 'app-kata-for-fun',
  templateUrl: './kata-for-fun.component.html'
})
export class KataForFunComponent implements OnInit, OnDestroy {
  numberConvertedList: NumberConverted[] = [];
  constructor(private kataForFunService: KataForFunService) { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    this.kataForFunService.convertNumber(inputNumber).subscribe(
      value => {
      const numberConverted: NumberConverted = {
        numberToConvert: inputNumber,
        result: value.result
      };
      this.numberConvertedList.push(numberConverted);
    }, error => {

      });
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
