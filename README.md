# MakeChangeProject

## Description

Program to calculate the amount of change based on an item's cost and the amount
tendered by the customer.

Amounts and types of change are displayed based on input.

### Usage:
User inputs item price and cash tender by customer when prompted

#### User Inputs
- Item price amount
- Amount tendered by customer

##### User Input Constraints
- Item price must be greater than $00.01
- Item price must be less than $1,000,000.00
- Amount tendered must be greater than or equal to item price

#### Display Outputs
- Item Amount
- Tendered Amount
- Change Amount
- Change denominations and amounts

###### Output Example

```formatted output
Enter Item Price: 
10.01
Enter Amount Tendered by Customer: 
88.68

Item Amount     : $      10.01
Tendered Amount : $      88.68
                  ------------
Change Amount   : $      78.67

*-----------------------------*
*  Give the following change  *
*-----------------------------*
| Bills:                      |
|          $ 20 :   3         |
|          $ 10 :   1         |
|           $ 5 :   1         |
|           $ 1 :   3         |
| Coins:                      |
|      Quarters :   2         |
|          Dime :   1         |
|        Nickel :   1         |
|       Pennies :   2         |
*-----------------------------*
```

## Technologies Used
- Java 8 (1.8.0_333)
- Eclipse 2022-03 (4.23.0) AArch64
- MacOS 12.4 M1

## What I Learned
- Double value manipulation with casting
- Floating point variables are annoying to work with for monetary values
- Eclipse refactoring
