package com.example.restraunt.wishlist.repository;

import com.example.restraunt.db.MemoryDbRepositoryAbstract;
import com.example.restraunt.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
}
