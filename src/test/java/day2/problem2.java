package day2;

public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Locators are key components in automation testing that help identify and
		 * interact with web elements on a webpage.
		 *
		 * A locator is a way to find and target a web element (button, textbox,
		 * checkbox, link, image, dropdown, etc.) so that Selenium can perform actions
		 * like:
		 *    - click()
		 *    - sendKeys()
		 *    - getText()
		 *    - isDisplayed()
		 *    - select
		 *
		 * ---------------------------------------------------------
		 * Types of Locators in Selenium
		 * ---------------------------------------------------------
		 * 1. TagName
		 * 2. ID
		 * 3. Name
		 * 4. ClassName
		 * 5. LinkText
		 * 6. PartialLinkText
		 * 7. CSS Selector
		 * 8. XPath
		 *
		 * ---------------------------------------------------------
		 * What is XPath?
		 * ---------------------------------------------------------
		 * XPath (XML Path Language) is a query language used to navigate and select 
		 * nodes/elements from an HTML or XML document.
		 *
		 * It is widely used in web automation because:
		 *   - It can handle dynamic elements
		 *   - It works even when ID/Name are missing
		 *   - It supports complex logical conditions
		 *
		 * ---------------------------------------------------------
		 * Types of XPath
		 * ---------------------------------------------------------
		 *
		 * 1. Absolute XPath
		 *      - Starts from root HTML tag
		 *      - Syntax: /html/body/div[1]/div[2]/input
		 *      - Not recommended (brittle, breaks easily)
		 *
		 * 2. Relative XPath (MOST IMPORTANT)
		 *      - Starts from anywhere in the document using //
		 *      - Syntax: //tagName[@attribute='value']
		 *      - Recommended because stable and flexible
		 *
		 * ---------------------------------------------------------
		 * Sub-Types of Relative XPath
		 * ---------------------------------------------------------
		 *
		 * 1. XPath by Attribute
		 *      Syntax:
		 *          //tagName[@attributeName='attributeValue']
		 *      Example:
		 *          //input[@id='email']
		 *
		 * 2. XPath by Text() 
		 *      Syntax:
		 *          //tagName[text()='visible_text']
		 *      Example:
		 *          //a[text()='Login']
		 *
		 * 3. XPath by contains()
		 *      Syntax:
		 *          //tagName[contains(@attribute,'partialValue')]
		 *      Example:
		 *          //input[contains(@name,'user')]
		 *
		 * 4. XPath by contains(text())
		 *      Syntax:
		 *          //tagName[contains(text(),'partial_text')]
		 *      Example:
		 *          //a[contains(text(),'Sign')]
		 *
		 * 5. XPath using index
		 *      Syntax:
		 *          (//input[@type='text'])[2]
		 *
		 *
		 * ---------------------------------------------------------
		 * When to Use XPath?
		 * ---------------------------------------------------------
		 * - When ID/Name are missing
		 * - When element is dynamic
		 * - When element requires logical selection
		 * - When multiple conditions required
		 * - When switching between parent/child is required
		 *
		 * XPath is the MOST powerful locator in Selenium.
		 */


	}

}
