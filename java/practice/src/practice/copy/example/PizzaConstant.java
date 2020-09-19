package practice.copy.example;

/**
 * Class PizzaConstant define constant value
 * @author phuong
 *
 */
public class PizzaConstant {
    enum ActionType
    {
        CONFIRM("1"), CANCEL("0"), COOK("2"), DELIVER("3");

        // declaring private variable for getting values
        private String action;

        // getter method
        public String getAction()
        {
            return this.action;
        }

        // enum constructor - cannot be public or protected
        private ActionType(String action)
        {
            this.action = action;
        }

    }

    public static final String ACTION = "action";
    public static final String ACTION1 = "action";

    public static void main(String[] args) {
        int typeAction = 1;
//        cách 1
//        ActionType action = ActionType.CONFIRM;
        ActionType action = ActionType.valueOf("CONFIRM");
        System.out.println(action.getAction());
    }
}
