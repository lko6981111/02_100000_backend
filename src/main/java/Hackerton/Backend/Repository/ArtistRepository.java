package Hackerton.Backend.Repository;

import Hackerton.Backend.Data.Entity.Artist;
import Hackerton.Backend.Data.Entity.ConcertReview;
import Hackerton.Backend.Data.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {

    Optional<Artist> findById(Integer id);
    Optional<Artist> findByUser(User user);
}
