package ca.gc.triagency.datastore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.gc.triagency.datastore.model.ApprovedAward;

public interface ViewApprovedAwards extends JpaRepository<ApprovedAward, Long> {

}
