package de.tekup.studentsabsence.repositories;

import de.tekup.studentsabsence.entities.Group;
import de.tekup.studentsabsence.entities.GroupSubject;
import de.tekup.studentsabsence.entities.GroupSubjectKey;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface GroupSubjectRepository extends CrudRepository<GroupSubject, GroupSubjectKey> {
    List<GroupSubject> findAllByGroup(Group id);
    @Query("select GroupSubject  g from GroupSubject gc ,Subject subject ,Group group where subject.id like :x and group.id=x2")
    GroupSubject find_groupSubject_by_Group_Id_and_Subject_Id(@Param("x2") Long id, @Param("x") Long id_subject);
}
