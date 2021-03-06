// ExpenseBuilder

package org.javamoney.examples.ez.money.gui.view.register;

import static org.javamoney.examples.ez.money.model.dynamic.transaction.TransactionTypeKeys.EXPENSE;

import org.javamoney.examples.ez.money.model.persisted.transaction.Transaction;

/**
 * This class facilitates creating expense transactions.
 */
final
class
ExpenseCreator
extends TypeCreator
{
  /**
   * Constructs a new expense creator.
   */
  protected
  ExpenseCreator()
  {
    super(EXPENSE);
  }

  /**
   * This method creates and then adds the newly created transaction to its
   * account. It then returns the transaction if it was successfully added,
   * otherwise it returns null.
   *
   * @return The transaction if successfully added, otherwise null.
   */
  @Override
  protected
  Transaction
  createAndAdd()
  {
    return addTransaction(createTransaction(EXPENSE));
  }
}
