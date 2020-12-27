
@Controller("/hello")
public static class HelloController {

	@RequestBody("/")
	public String index(){
		return "Hello World";
	}

}
