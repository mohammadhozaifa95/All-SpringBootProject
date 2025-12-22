/*
 * package SpringBootDemo.repo;
 * 
 * import java.util.List;
 * 
 * import org.springframework.data.jpa.repository.JpaRepository; import
 * org.springframework.data.jpa.repository.Modifying; import
 * org.springframework.data.jpa.repository.Query; import
 * org.springframework.data.repository.query.Param;
 * 
 * import SpringBootDemo.model.Employee; import
 * jakarta.transaction.Transactional;
 * 
 * public interface EmpRepo extends JpaRepository<Employee, Integer> {
 * 
 * public List<Employee> findByName(String name);
 * 
 * public List<Employee> findByAddress(String address);
 * 
 * // //Query,Modifying,Transational,
 * 
 * @Query("Select u from Employee u") public List<Employee> getAllEmp();
 * 
 * @Query("Select e from Employee e where e.name=:n And e.address=:ad") public
 * List<Employee> getByNameAndAddress(@Param("n") String
 * name, @Param("ad")String Address);
 * 
 * @Query("Update Employee e Set e.name=:name where e.id=:id")
 * 
 * @Modifying
 * 
 * @Transactional public int UpdateEmp(String name, int id);
 * 
 * @Query("Delete from Employee e where e.id=:d")
 * 
 * @Modifying
 * 
 * @Transactional public void delete(@Param("d")int id);
 * 
 * @Query(value = "Select * from employee" ,nativeQuery =true) public
 * List<Employee> getAll();
 * 
 * 
 * 
 * }
 */