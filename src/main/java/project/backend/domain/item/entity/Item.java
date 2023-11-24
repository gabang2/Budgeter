package project.backend.domain.item.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.backend.domain.budget.entity.Budget;
import project.backend.domain.expense.entity.Expense;

@Getter
@NoArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "budget_id")
    private Budget budget;

    @ManyToOne
    @JoinColumn(name = "expense_id")
    private Expense expense;

    @Enumerated(EnumType.STRING)
    private Category category;

    private Integer amount;
}
