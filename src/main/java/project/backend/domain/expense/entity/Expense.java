package project.backend.domain.expense.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.backend.domain.consumer.entity.Consumer;
import project.backend.domain.item.entity.Item;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "consumer_id")
    private Consumer consumer;

    @OneToMany(mappedBy = "expense", cascade = CascadeType.ALL)
    private List<Item> items = new ArrayList<>();
}
