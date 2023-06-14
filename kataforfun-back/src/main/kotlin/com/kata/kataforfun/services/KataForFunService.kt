package com.kata.kataforfun.services

import com.kata.kataforfun.models.Divisor
import org.springframework.stereotype.Component
import kotlin.collections.ArrayList

@Component
class KataForFunService {


    fun convertNumber(inputNumber: Int): String {
        val inputNumberAsString = inputNumber.toString();
        var convertValue = "";
        var divisors: ArrayList<Divisor> = ArrayList();

        divisors = retrieveDivisors(inputNumberAsString, divisors);

        divisors.forEach { divisor ->
            run {
                val numberOfCharacterOccurence: Int = retrieveNumberOfCharacterOccurence(inputNumberAsString, divisor.character);
                if(numberOfCharacterOccurence > 0) {
                    for (value in 1..numberOfCharacterOccurence) {
                        convertValue += divisor.value;
                    }
                }
                if (!divisor.equals(Divisor.SEVEN) && isInputNumberDivisibleByDivisor(inputNumber, divisor.character.toString())) {
                    convertValue += divisor.value;
                }
            }
        }
        return if (convertValue.isNotEmpty()) convertValue else inputNumberAsString;
    }

    private fun retrieveDivisors(inputNumberAsString: String, list: ArrayList<Divisor>): ArrayList<Divisor> {
        var divisors = list

        if (isInputNumberContainMultipleDivisor(inputNumberAsString)) {
            inputNumberAsString.toCharArray().forEach { c ->
                run {
                    when (c) {
                        Divisor.THREE.character -> divisors.add(Divisor.THREE);
                        Divisor.FIVE.character -> divisors.add(Divisor.FIVE);
                        Divisor.SEVEN.character -> divisors.add(Divisor.SEVEN);
                    }
                }
            }
        } else {
            divisors = Divisor.values().toMutableList() as ArrayList<Divisor>;
        }
        return divisors
    }

    private fun isInputNumberContainMultipleDivisor(inputNumberAsString: String): Boolean {
        val containDivisorThree = inputNumberAsString.toList().contains(Divisor.THREE.character);
        val containDivisorFive = inputNumberAsString.toList().contains(Divisor.FIVE.character);
        val containDivisorSeven = inputNumberAsString.toList().contains(Divisor.SEVEN.character);
        return containDivisorThree && containDivisorFive || containDivisorFive && containDivisorSeven || containDivisorThree && containDivisorSeven;
    }

    private fun isInputNumberDivisibleByDivisor(inputNumber: Int, divisor: String): Boolean {
        return inputNumber % divisor.toInt() == 0;
    }

    private fun retrieveNumberOfCharacterOccurence(inputNumberString: String, character: Char): Int {
        return inputNumberString.count { it == character };
    }
}


