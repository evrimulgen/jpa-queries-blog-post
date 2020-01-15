package dev.drugowick.jpaqueriesblogpost.infrastructure.repository;

import dev.drugowick.jpaqueriesblogpost.domain.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    List<Restaurant> findAllByNameContaining(String query);

    List<Restaurant> findAllByCuisineNameContaining(String cuisine);

    List<Restaurant> findAllByDeliveryFeeIsLessThanEqual(BigDecimal deliveryFee);

    long countByCuisineName(String cuisine);

    Restaurant findTopByCuisineNameOrderByDeliveryFeeAsc(String cuisine);
}
