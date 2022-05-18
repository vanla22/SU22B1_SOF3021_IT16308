package su22.sof3021.beans.admin;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
	@NotBlank(message="Không được để trống")
	private String hoTen;

	@NotBlank
	private String diaChi;

	@NotNull
	private int gioiTinh;
	
	@NotBlank
	private String email;

	@NotBlank
	private String password;

	@NotBlank
	private String sdt;
	
	@Null
	private String avatar;
}
