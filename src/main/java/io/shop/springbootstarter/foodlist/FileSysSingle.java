package io.shop.springbootstarter.foodlist;

import io.shop.springbootstarter.factory.Food;
import io.shop.springbootstarter.factory.FoodFactory;
import io.shop.springbootstarter.factory.typeFood;

import java.io.*;
import java.util.List;

public class FileSysSingle {
    private static FileSysSingle instance = null;
    private static File file;

    private FileSysSingle(){
        this.file = new File("foodList.txt");
        if(!file.exists()){
            FoodFactory.createFoods.add(FoodFactory.createFood(1, "noodles", "Ramen", 150.00, "Japan"));
            FoodFactory.createFoods.add(FoodFactory.createFood(2, "fastfood", "Burger", 120.00, "USA"));
            FoodFactory.createFoods.add(FoodFactory.createFood(3, "esan", "Somtum", 50.00, "Thai"));
            FoodFactory.createFoods.add(FoodFactory.createFood(4, "coffeetea", "Iced Tea", 40.00, "Thai"));
            FoodFactory.createFoods.add(FoodFactory.createFood(5, "ricebowls", "Rice with Pig Fired Garlic", 40.00, "Thai"));
            FoodFactory.createFoods.add(FoodFactory.createFood(6, "sweet", "Red Velvet Cake", 105.00, "Japan"));
            FoodFactory.createFoods.add(FoodFactory.createFood(7, "fastfood", "Pizza", 180.00, "Italian"));
            FoodFactory.createFoods.add(FoodFactory.createFood(8, "esan", "Larb", 60.00, "Thai"));
            FileSysSingle.saveFile(FoodFactory.createFoods);
        }


    }
    public static FileSysSingle getInstance(){
        if(instance == null){
            instance = new FileSysSingle();
        }else{

            System.out.println("File already create");
        }
        return instance;
    }

    public static List<Food> fileLoad(){
        try{
            FileInputStream fileInput = new FileInputStream(file);
            ObjectInputStream input_Obj = new ObjectInputStream(fileInput);
            List<Food> foods = (List<Food>) input_Obj.readObject();
            input_Obj.close();
            return foods;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveFile(List<Food> foods){
        try{
            FileOutputStream output_file = new FileOutputStream(file);
            ObjectOutputStream output_Obj = new ObjectOutputStream(output_file);
            output_Obj.writeObject(foods);
            output_Obj.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
