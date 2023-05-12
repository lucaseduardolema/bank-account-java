package com.betrybe.acc.java.bankaccount;


/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String response = String.valueOf(literalAccountNumber);

    while (response.length() < 6) {
      response = "0" + response;
    }

    if (response.length() > 6) {
      response = response.substring(response.length() - 6, response.length());
    }

    return response;
  }

}
