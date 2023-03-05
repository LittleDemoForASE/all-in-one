package ch.uzh.ifi.hase.soprafs22.rest.mapper;

import ch.uzh.ifi.hase.soprafs22.constant.Gender;
import ch.uzh.ifi.hase.soprafs22.entity.Ingredient;
import ch.uzh.ifi.hase.soprafs22.entity.Party;
import ch.uzh.ifi.hase.soprafs22.entity.Recipe;
import ch.uzh.ifi.hase.soprafs22.entity.User;
import ch.uzh.ifi.hase.soprafs22.rest.dto.ingredient.IngredientGetDTO;
import ch.uzh.ifi.hase.soprafs22.rest.dto.ingredient.IngredientPostDTO;
import ch.uzh.ifi.hase.soprafs22.rest.dto.ingredient.IngredientPutDTO;
import ch.uzh.ifi.hase.soprafs22.rest.dto.party.PartyGetDTO;
import ch.uzh.ifi.hase.soprafs22.rest.dto.party.PartyPostDTO;
import ch.uzh.ifi.hase.soprafs22.rest.dto.party.PartyPutDTO;
import ch.uzh.ifi.hase.soprafs22.rest.dto.recipe.RecipeGetDTO;
import ch.uzh.ifi.hase.soprafs22.rest.dto.recipe.RecipePostDTO;
import ch.uzh.ifi.hase.soprafs22.rest.dto.recipe.RecipePutDTO;
import ch.uzh.ifi.hase.soprafs22.rest.dto.user.UserGetDTO;
import ch.uzh.ifi.hase.soprafs22.rest.dto.user.UserPostDTO;
import ch.uzh.ifi.hase.soprafs22.rest.dto.user.UserPutDTO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-05T01:57:00+0100",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230213-1046, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class DTOMapperImpl implements DTOMapper {

    @Override
    public User convertUserPostDTOtoEntity(UserPostDTO userPostDTO) {
        if ( userPostDTO == null ) {
            return null;
        }

        User user = new User();

        user.setPassword( userPostDTO.getPassword() );
        user.setUsername( userPostDTO.getUsername() );
        user.setBirthday( userPostDTO.getBirthday() );
        user.setProfilePictureLocation( userPostDTO.getProfilePictureLocation() );

        return user;
    }

    @Override
    public UserGetDTO convertEntityToUserGetDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserGetDTO userGetDTO = new UserGetDTO();

        Set<Party> set = user.getHostParties();
        if ( set != null ) {
            userGetDTO.setHostParties( new HashSet<Party>( set ) );
        }
        userGetDTO.setGender( user.getGender() );
        userGetDTO.setIntro( user.getIntro() );
        Set<Long> set1 = user.getJoinParties();
        if ( set1 != null ) {
            userGetDTO.setJoinParties( new HashSet<Long>( set1 ) );
        }
        userGetDTO.setId( user.getId() );
        userGetDTO.setProfilePictureLocation( user.getProfilePictureLocation() );
        userGetDTO.setCreationDate( user.getCreationDate() );
        userGetDTO.setUsername( user.getUsername() );
        userGetDTO.setToken( user.getToken() );
        userGetDTO.setBirthday( user.getBirthday() );
        Set<Recipe> set2 = user.getRecipes();
        if ( set2 != null ) {
            userGetDTO.setRecipes( new HashSet<Recipe>( set2 ) );
        }
        List<Recipe> list = user.getLikeList();
        if ( list != null ) {
            userGetDTO.setLikeList( new ArrayList<Recipe>( list ) );
        }

        return userGetDTO;
    }

    @Override
    public User convertUserPutDTOtoEntity(UserPutDTO userPutDTO) {
        if ( userPutDTO == null ) {
            return null;
        }

        User user = new User();

        user.setBirthday( userPutDTO.getBirthday() );
        if ( userPutDTO.getGender() != null ) {
            user.setGender( Enum.valueOf( Gender.class, userPutDTO.getGender() ) );
        }
        user.setIntro( userPutDTO.getIntro() );
        user.setId( userPutDTO.getId() );
        user.setProfilePictureLocation( userPutDTO.getProfilePictureLocation() );
        user.setUsername( userPutDTO.getUsername() );

        return user;
    }

    @Override
    public Recipe convertRecipePostDTOtoEntity(RecipePostDTO RecipePostDTO) {
        if ( RecipePostDTO == null ) {
            return null;
        }

        Recipe recipe = new Recipe();

        recipe.setRecipeName( RecipePostDTO.getRecipeName() );
        recipe.setCost( RecipePostDTO.getCost() );
        recipe.setPictureLocation( RecipePostDTO.getPictureLocation() );
        recipe.setPortion( RecipePostDTO.getPortion() );
        recipe.setCuisine( RecipePostDTO.getCuisine() );
        List<Ingredient> list = RecipePostDTO.getIngredients();
        if ( list != null ) {
            recipe.setIngredients( new ArrayList<Ingredient>( list ) );
        }
        recipe.setAuthorId( RecipePostDTO.getAuthorId() );
        recipe.setCreationDate( RecipePostDTO.getCreationDate() );
        recipe.setContent( RecipePostDTO.getContent() );
        recipe.setTimeConsumed( RecipePostDTO.getTimeConsumed() );

        return recipe;
    }

    @Override
    public Recipe convertRecipePutDTOtoEntity(RecipePutDTO RecipePutDTO) {
        if ( RecipePutDTO == null ) {
            return null;
        }

        Recipe recipe = new Recipe();

        recipe.setRecipeName( RecipePutDTO.getRecipeName() );
        recipe.setCost( RecipePutDTO.getCost() );
        recipe.setPictureLocation( RecipePutDTO.getPictureLocation() );
        recipe.setPortion( RecipePutDTO.getPortion() );
        recipe.setCuisine( RecipePutDTO.getCuisine() );
        recipe.setIngredients( ingredientPutDTOListToIngredientList( RecipePutDTO.getIngredients() ) );
        recipe.setAuthorId( RecipePutDTO.getAuthorId() );
        recipe.setCreationDate( RecipePutDTO.getCreationDate() );
        recipe.setContent( RecipePutDTO.getContent() );
        recipe.setTimeConsumed( RecipePutDTO.getTimeConsumed() );
        recipe.setLikesNum( RecipePutDTO.getLikesNum() );

        return recipe;
    }

    @Override
    public RecipeGetDTO convertEntityToRecipeGetDTO(Recipe recipe) {
        if ( recipe == null ) {
            return null;
        }

        RecipeGetDTO recipeGetDTO = new RecipeGetDTO();

        recipeGetDTO.setRecipeName( recipe.getRecipeName() );
        recipeGetDTO.setCost( recipe.getCost() );
        recipeGetDTO.setPortion( recipe.getPortion() );
        recipeGetDTO.setPictureLocation( recipe.getPictureLocation() );
        recipeGetDTO.setCuisine( recipe.getCuisine() );
        List<Ingredient> list = recipe.getIngredients();
        if ( list != null ) {
            recipeGetDTO.setIngredients( new ArrayList<Ingredient>( list ) );
        }
        recipeGetDTO.setAuthorId( recipe.getAuthorId() );
        recipeGetDTO.setCreationDate( recipe.getCreationDate() );
        recipeGetDTO.setRecipeId( recipe.getRecipeId() );
        recipeGetDTO.setContent( recipe.getContent() );
        recipeGetDTO.setTimeConsumed( recipe.getTimeConsumed() );
        recipeGetDTO.setLikesNum( recipe.getLikesNum() );

        return recipeGetDTO;
    }

    @Override
    public IngredientGetDTO convertEntityToIngredientGetDTO(Ingredient ingredient) {
        if ( ingredient == null ) {
            return null;
        }

        IngredientGetDTO ingredientGetDTO = new IngredientGetDTO();

        ingredientGetDTO.setName( ingredient.getName() );
        ingredientGetDTO.setIngredientId( ingredient.getIngredientId() );
        ingredientGetDTO.setAmount( ingredient.getAmount() );
        ingredientGetDTO.setRecipeId( ingredient.getRecipeId() );
        ingredientGetDTO.setPartyId( ingredient.getPartyId() );
        ingredientGetDTO.setTakerName( ingredient.getTakerName() );
        ingredientGetDTO.setTakerId( ingredient.getTakerId() );

        return ingredientGetDTO;
    }

    @Override
    public Ingredient convertIngredientPostDTOtoEntity(IngredientPostDTO ingredientPostDTO) {
        if ( ingredientPostDTO == null ) {
            return null;
        }

        Ingredient ingredient = new Ingredient();

        ingredient.setName( ingredientPostDTO.getName() );
        ingredient.setAmount( ingredientPostDTO.getAmount() );
        ingredient.setIngredientId( ingredientPostDTO.getIngredientId() );
        ingredient.setRecipeId( ingredientPostDTO.getRecipeId() );
        ingredient.setPartyId( ingredientPostDTO.getPartyId() );
        ingredient.setTakerId( ingredientPostDTO.getTakerId() );
        ingredient.setTakerName( ingredientPostDTO.getTakerName() );

        return ingredient;
    }

    @Override
    public Party convertPartyPostDTOtoEntity(PartyPostDTO partyPostDTO) {
        if ( partyPostDTO == null ) {
            return null;
        }

        Party party = new Party();

        party.setRecipeUsedId( partyPostDTO.getRecipeUsedId() );
        party.setPartyName( partyPostDTO.getPartyName() );
        List<String> list = partyPostDTO.getPartyAttendantsList();
        if ( list != null ) {
            party.setPartyAttendantsList( new ArrayList<String>( list ) );
        }
        party.setPlace( partyPostDTO.getPlace() );
        party.setTime( partyPostDTO.getTime() );
        party.setPartyHostId( partyPostDTO.getPartyHostId() );
        party.setPartyIntro( partyPostDTO.getPartyIntro() );

        return party;
    }

    @Override
    public PartyGetDTO convertEntityToPartyGetDTO(Party party) {
        if ( party == null ) {
            return null;
        }

        PartyGetDTO partyGetDTO = new PartyGetDTO();

        List<String> list = party.getPartyAttendantsList();
        if ( list != null ) {
            partyGetDTO.setPartyAttendantsList( new ArrayList<String>( list ) );
        }
        partyGetDTO.setCreationDate( party.getCreationDate() );
        partyGetDTO.setPartyHostId( party.getPartyHostId() );
        partyGetDTO.setRecipeUsedName( party.getRecipeUsedName() );
        partyGetDTO.setPartyAttendantsNum( party.getPartyAttendantsNum() );
        partyGetDTO.setRecipeUsedId( party.getRecipeUsedId() );
        partyGetDTO.setPartyName( party.getPartyName() );
        List<Ingredient> list1 = party.getIngredients();
        if ( list1 != null ) {
            partyGetDTO.setIngredients( new ArrayList<Ingredient>( list1 ) );
        }
        partyGetDTO.setPlace( party.getPlace() );
        partyGetDTO.setTime( party.getTime() );
        partyGetDTO.setPartyId( party.getPartyId() );
        partyGetDTO.setPartyIntro( party.getPartyIntro() );

        return partyGetDTO;
    }

    @Override
    public Party convertPartyPutDTOtoEntity(PartyPutDTO partyPutDTO) {
        if ( partyPutDTO == null ) {
            return null;
        }

        Party party = new Party();

        List<String> list = partyPutDTO.getPartyAttendantsList();
        if ( list != null ) {
            party.setPartyAttendantsList( new ArrayList<String>( list ) );
        }
        party.setPlace( partyPutDTO.getPlace() );
        party.setTime( partyPutDTO.getTime() );
        party.setPartyIntro( partyPutDTO.getPartyIntro() );
        party.setPartyName( partyPutDTO.getPartyName() );

        return party;
    }

    protected Ingredient ingredientPutDTOToIngredient(IngredientPutDTO ingredientPutDTO) {
        if ( ingredientPutDTO == null ) {
            return null;
        }

        Ingredient ingredient = new Ingredient();

        ingredient.setName( ingredientPutDTO.getName() );
        ingredient.setAmount( ingredientPutDTO.getAmount() );
        ingredient.setIngredientId( ingredientPutDTO.getIngredientId() );
        ingredient.setRecipeId( ingredientPutDTO.getRecipeId() );
        ingredient.setPartyId( ingredientPutDTO.getPartyId() );
        ingredient.setTakerId( ingredientPutDTO.getTakerId() );
        ingredient.setTakerName( ingredientPutDTO.getTakerName() );

        return ingredient;
    }

    protected List<Ingredient> ingredientPutDTOListToIngredientList(List<IngredientPutDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Ingredient> list1 = new ArrayList<Ingredient>( list.size() );
        for ( IngredientPutDTO ingredientPutDTO : list ) {
            list1.add( ingredientPutDTOToIngredient( ingredientPutDTO ) );
        }

        return list1;
    }
}
