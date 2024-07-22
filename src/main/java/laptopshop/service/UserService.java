package laptopshop.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import laptopshop.domain.Role;
import laptopshop.domain.User;
import laptopshop.domain.dto.RegisterDTO;
import laptopshop.repository.OderRepository;
import laptopshop.repository.ProductRepository;
import laptopshop.repository.RoleRepository;
import laptopshop.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final ProductRepository productRepository;
    private final OderRepository oderRepository;

    public UserService(
            UserRepository userRepository, RoleRepository roleRepository,
            ProductRepository productRepository,
            OderRepository oderRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.productRepository = productRepository;
        this.oderRepository = oderRepository;

    }

    public User findByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public Page<User> getAllUsers(Pageable page) {
        return this.userRepository.findAll(page);
    }

    public User handelSaveUser(User user) {
        return this.userRepository.save(user);
    }

    public User getUserByID(long id) {
        return this.userRepository.findAllById(id);
    }

    public void deleteUserByID(long id) {
        this.userRepository.deleteById(id);
    }

    public Role getRoleByName(String name) {
        return this.roleRepository.findByName(name);
    }

    public User registerDTOtoUser(RegisterDTO registerDTO) {
        User user = new User();
        user.setFullName(registerDTO.getFirstName() + " " + registerDTO.getLastName());
        user.setEmail(registerDTO.getEmail());
        user.setPassword(registerDTO.getPassword());
        return user;
    }

    public boolean checkEmailExist(String email) {
        return this.userRepository.existsByEmail(email);

    }

    public User getUserByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public long countUsers() {
        return this.userRepository.count();
    }

    public long countProducts() {
        return this.productRepository.count();
    }

    public long countOrders() {
        return this.oderRepository.count();
    }
}
