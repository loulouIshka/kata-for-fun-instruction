import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Result} from './model/result';

@Injectable({
  providedIn: 'root'
})
export class KataForFunService {
  constructor(private httpClient: HttpClient) {
  }

  readonly baseUrl = 'http://localhost:8080';
  readonly endPoint = 'kata-for-fun';

  convertNumber(inputNumber: number): Observable<Result> | Observable<object> {
    return this.httpClient.get(this.baseUrl + '/' + this.endPoint + '/' + inputNumber);
  }

}
