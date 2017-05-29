

# Project Strucutre Guideline
Your all the functionality must be separated by the packages name that means you must follow the project structure guideline as follows.

### Following are the packages will be in your project.

1. adapters => Adapter java classes will be here
2. api 	  => Mechanism which handles your end request will be there
3. fonts 	  => All the external fonts will be there
4. listeners => Custom listeners/interface you will put here
5. models   => Any Model/Pojo class will be there
6. ui             => In ui packager there will be 3 three more packages  1) activities 2 fragments 3) customViews
6. utils	  => All your useful functions and utility code will be here

## Fonts
	Add your fonts .ttf file in assets/font folder
	Define your font path into string file like follows
  
  ```javascript
<string name ="aller_bold">fonts/Aller_Bd.ttf</string>
```
and define your desired widget with desired font like this,

```javascript
<CustomTextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:fontStyle="@string/aller_regular"
            android:textSize="18sp"
            android:id="@+id/tabTitle"
            android:textColor="@color/color_light"
            android:text="Dr.Eliot Blitzer"
            android:layout_marginTop="5dp"/>

```




