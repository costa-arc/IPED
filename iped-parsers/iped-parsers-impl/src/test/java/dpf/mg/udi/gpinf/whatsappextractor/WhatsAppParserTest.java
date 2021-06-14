package dpf.mg.udi.gpinf.whatsappextractor;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.SeekableByteChannel;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.junit.Test;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

import dpf.sp.gpinf.indexer.parsers.IndexerDefaultParser;
import dpf.sp.gpinf.indexer.parsers.util.ItemInfo;
import iped3.datasource.IDataSource;
import iped3.io.IItemBase;
import iped3.io.SeekableInputStream;
import iped3.search.IItemSearcher;
import junit.framework.TestCase;

public class WhatsAppParserTest extends TestCase{

    private static InputStream getStream(String name) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream(name);
    } 
    
    @Test
    public void testWhatsAppParser() throws IOException, SAXException, TikaException{

        WhatsAppParser parser = new WhatsAppParser();
        Metadata metadata = new Metadata();
        metadata.add(IndexerDefaultParser.INDEXER_CONTENT_TYPE, "application/x-whatsapp-db");
        ContentHandler handler = new BodyContentHandler(1<<20);
        ParseContext context = new ParseContext();
        IItemSearcher itemSearcher = new IItemSearcher() {
            
            @Override
            public void close() throws IOException {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public Iterable<IItemBase> searchIterable(String luceneQuery) {
                // TODO Auto-generated method stub
                return searchIterable(luceneQuery);
            }
            
            @Override
            public List<IItemBase> search(String luceneQuery) {
                // TODO Auto-generated method stub
                return new List<IItemBase>() {
                    
                    @Override
                    public <T> T[] toArray(T[] a) {
                        // TODO Auto-generated method stub
                        return null;
                    }
                    
                    @Override
                    public Object[] toArray() {
                        // TODO Auto-generated method stub
                        return null;
                    }
                    
                    @Override
                    public List<IItemBase> subList(int fromIndex, int toIndex) {
                        // TODO Auto-generated method stub
                        return null;
                    }
                    
                    @Override
                    public int size() {
                        // TODO Auto-generated method stub
                        return 0;
                    }
                    
                    @Override
                    public IItemBase set(int index, IItemBase element) {
                        // TODO Auto-generated method stub
                        return null;
                    }
                    
                    @Override
                    public boolean retainAll(Collection<?> c) {
                        // TODO Auto-generated method stub
                        return false;
                    }
                    
                    @Override
                    public boolean removeAll(Collection<?> c) {
                        // TODO Auto-generated method stub
                        return false;
                    }
                    
                    @Override
                    public IItemBase remove(int index) {
                        // TODO Auto-generated method stub
                        return null;
                    }
                    
                    @Override
                    public boolean remove(Object o) {
                        // TODO Auto-generated method stub
                        return false;
                    }
                    
                    @Override
                    public ListIterator<IItemBase> listIterator(int index) {
                        // TODO Auto-generated method stub
                        return null;
                    }
                    
                    @Override
                    public ListIterator<IItemBase> listIterator() {
                        // TODO Auto-generated method stub
                        return null;
                    }
                    
                    @Override
                    public int lastIndexOf(Object o) {
                        // TODO Auto-generated method stub
                        return 0;
                    }
                    
                    @Override
                    public Iterator<IItemBase> iterator() {
                        // TODO Auto-generated method stub
                        return null;
                    }
                    
                    @Override
                    public boolean isEmpty() {
                        // TODO Auto-generated method stub
                        return false;
                    }
                    
                    @Override
                    public int indexOf(Object o) {
                        // TODO Auto-generated method stub
                        return 0;
                    }
                    
                    @Override
                    public IItemBase get(int index) {
                        // TODO Auto-generated method stub
                        return new IItemBase() {
                            
                            @Override
                            public SeekableInputStream getStream() throws IOException {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public SeekableByteChannel getSeekableByteChannel() throws IOException {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public boolean isTimedOut() {
                                // TODO Auto-generated method stub
                                return false;
                            }
                            
                            @Override
                            public boolean isSubItem() {
                                // TODO Auto-generated method stub
                                return false;
                            }
                            
                            @Override
                            public boolean isRoot() {
                                // TODO Auto-generated method stub
                                return false;
                            }
                            
                            @Override
                            public boolean isDuplicate() {
                                // TODO Auto-generated method stub
                                return false;
                            }
                            
                            @Override
                            public boolean isDir() {
                                // TODO Auto-generated method stub
                                return false;
                            }
                            
                            @Override
                            public boolean isDeleted() {
                                // TODO Auto-generated method stub
                                return false;
                            }
                            
                            @Override
                            public boolean isCarved() {
                                // TODO Auto-generated method stub
                                return false;
                            }
                            
                            @Override
                            public boolean hasFile() {
                                // TODO Auto-generated method stub
                                return true;
                            }
                            
                            @Override
                            public boolean hasChildren() {
                                // TODO Auto-generated method stub
                                return false;
                            }
                            
                            @Override
                            public File getViewFile() {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public String getTypeExt() {
                                // TODO Auto-generated method stub
                                return new String();
                            }
                            
                            @Override
                            public byte[] getThumb() {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public File getTempFile() throws IOException {
                                // TODO Auto-generated method stub
                                return getFile();
                            }
                            
                            @Override
                            public Integer getSubitemId() {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public Date getRecordDate() {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public String getPath() {
                                // TODO Auto-generated method stub
                                return getPath();
                            }
                            
                            @Override
                            public Integer getParentId() {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public String getName() {
                                // TODO Auto-generated method stub
                                return new String();
                            }
                            
                            @Override
                            public Date getModDate() {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public Metadata getMetadata() {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public MediaType getMediaType() {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public Long getLength() {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public byte[] getImageSimilarityFeatures() {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public int getId() {
                                // TODO Auto-generated method stub
                                return 0;
                            }
                            
                            @Override
                            public String getHash() {
                                // TODO Auto-generated method stub
                                return new String();
                            }
                            
                            @Override
                            public File getFile() {
                                // TODO Auto-generated method stub
                                return new File("src/test/resources/test-files/testFile");
                            }
                            
                            @Override
                            public Map<String, Object> getExtraAttributeMap() {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public Object getExtraAttribute(String key) {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public String getExt() {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public IDataSource getDataSource() {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public Date getCreationDate() {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public HashSet<String> getCategorySet() {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public BufferedInputStream getBufferedStream() throws IOException {
                                // TODO Auto-generated method stub
                                return null;
                            }
                            
                            @Override
                            public Date getAccessDate() {
                                // TODO Auto-generated method stub
                                return null;
                            }
                        };
                    }
                    
                    @Override
                    public boolean containsAll(Collection<?> c) {
                        // TODO Auto-generated method stub
                        return false;
                    }
                    
                    @Override
                    public boolean contains(Object o) {
                        // TODO Auto-generated method stub
                        return false;
                    }
                    
                    @Override
                    public void clear() {
                        // TODO Auto-generated method stub
                        
                    }
                    
                    @Override
                    public boolean addAll(int index, Collection<? extends IItemBase> c) {
                        // TODO Auto-generated method stub
                        return false;
                    }
                    
                    @Override
                    public boolean addAll(Collection<? extends IItemBase> c) {
                        // TODO Auto-generated method stub
                        return false;
                    }
                    
                    @Override
                    public void add(int index, IItemBase element) {
                        // TODO Auto-generated method stub
                        
                    }
                    
                    @Override
                    public boolean add(IItemBase e) {
                        // TODO Auto-generated method stub
                        return false;
                    }
                };
            }
            
            @Override
            public String escapeQuery(String string) {
                // TODO Auto-generated method stub
                return string;
            }
        };
        ItemInfo itemInfo = new ItemInfo(0, getName(), null, null, getName(), false);
        context.set(ItemInfo.class, itemInfo);
        context.set(IItemSearcher.class, itemSearcher);
        InputStream stream = getStream("test-files/whatsapp/msgstore.db");
        parser.setExtractMessages(true);
        parser.setMergeDbs(false);
        parser.getSupportedTypes(context);
//        parser.parse(stream, handler, metadata, context);
    }

    @Test
  public void testWhatsAppParserWADB() throws IOException, SAXException, TikaException{

      WhatsAppParser parser = new WhatsAppParser();
      Metadata metadata = new Metadata();
      metadata.add(IndexerDefaultParser.INDEXER_CONTENT_TYPE, "application/x-whatsapp-wadb");
      ContentHandler handler = new BodyContentHandler(1<<20);
      ParseContext context = new ParseContext();
      InputStream stream = getStream("test-files/whatsapp/wa.db");
      IItemSearcher itemSearcher = new IItemSearcher() {

          @Override
          public void close() throws IOException {
              // TODO Auto-generated method stub

          }

          @Override
          public Iterable<IItemBase> searchIterable(String luceneQuery) {
              // TODO Auto-generated method stub
              return searchIterable(luceneQuery);
          }

          @Override
          public List<IItemBase> search(String luceneQuery) {
              // TODO Auto-generated method stub
              return new List<IItemBase>() {

                  @Override
                  public <T> T[] toArray(T[] a) {
                      // TODO Auto-generated method stub
                      return null;
                  }

                  @Override
                  public Object[] toArray() {
                      // TODO Auto-generated method stub
                      return null;
                  }

                  @Override
                  public List<IItemBase> subList(int fromIndex, int toIndex) {
                      // TODO Auto-generated method stub
                      return null;
                  }

                  @Override
                  public int size() {
                      // TODO Auto-generated method stub
                      return 0;
                  }

                  @Override
                  public IItemBase set(int index, IItemBase element) {
                      // TODO Auto-generated method stub
                      return null;
                  }

                  @Override
                  public boolean retainAll(Collection<?> c) {
                      // TODO Auto-generated method stub
                      return false;
                  }

                  @Override
                  public boolean removeAll(Collection<?> c) {
                      // TODO Auto-generated method stub
                      return false;
                  }

                  @Override
                  public IItemBase remove(int index) {
                      // TODO Auto-generated method stub
                      return null;
                  }

                  @Override
                  public boolean remove(Object o) {
                      // TODO Auto-generated method stub
                      return false;
                  }

                  @Override
                  public ListIterator<IItemBase> listIterator(int index) {
                      // TODO Auto-generated method stub
                      return null;
                  }

                  @Override
                  public ListIterator<IItemBase> listIterator() {
                      // TODO Auto-generated method stub
                      return null;
                  }

                  @Override
                  public int lastIndexOf(Object o) {
                      // TODO Auto-generated method stub
                      return 0;
                  }

                  @Override
                  public Iterator<IItemBase> iterator() {
                      // TODO Auto-generated method stub
                      return null;
                  }

                  @Override
                  public boolean isEmpty() {
                      // TODO Auto-generated method stub
                      return false;
                  }

                  @Override
                  public int indexOf(Object o) {
                      // TODO Auto-generated method stub
                      return 0;
                  }

                  @Override
                  public IItemBase get(int index) {
                      // TODO Auto-generated method stub
                      return new IItemBase() {

                          @Override
                          public SeekableInputStream getStream() throws IOException {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public SeekableByteChannel getSeekableByteChannel() throws IOException {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public boolean isTimedOut() {
                              // TODO Auto-generated method stub
                              return false;
                          }

                          @Override
                          public boolean isSubItem() {
                              // TODO Auto-generated method stub
                              return false;
                          }

                          @Override
                          public boolean isRoot() {
                              // TODO Auto-generated method stub
                              return false;
                          }

                          @Override
                          public boolean isDuplicate() {
                              // TODO Auto-generated method stub
                              return false;
                          }

                          @Override
                          public boolean isDir() {
                              // TODO Auto-generated method stub
                              return false;
                          }

                          @Override
                          public boolean isDeleted() {
                              // TODO Auto-generated method stub
                              return false;
                          }

                          @Override
                          public boolean isCarved() {
                              // TODO Auto-generated method stub
                              return false;
                          }

                          @Override
                          public boolean hasFile() {
                              // TODO Auto-generated method stub
                              return true;
                          }

                          @Override
                          public boolean hasChildren() {
                              // TODO Auto-generated method stub
                              return false;
                          }

                          @Override
                          public File getViewFile() {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public String getTypeExt() {
                              // TODO Auto-generated method stub
                              return new String();
                          }

                          @Override
                          public byte[] getThumb() {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public File getTempFile() throws IOException {
                              // TODO Auto-generated method stub
                              return getFile();
                          }

                          @Override
                          public Integer getSubitemId() {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public Date getRecordDate() {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public String getPath() {
                              // TODO Auto-generated method stub
                              return getPath();
                          }

                          @Override
                          public Integer getParentId() {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public String getName() {
                              // TODO Auto-generated method stub
                              return new String();
                          }

                          @Override
                          public Date getModDate() {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public Metadata getMetadata() {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public MediaType getMediaType() {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public Long getLength() {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public byte[] getImageSimilarityFeatures() {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public int getId() {
                              // TODO Auto-generated method stub
                              return 0;
                          }

                          @Override
                          public String getHash() {
                              // TODO Auto-generated method stub
                              return new String();
                          }

                          @Override
                          public File getFile() {
                              // TODO Auto-generated method stub
                              return new File("src/test/resources/test-files/testFile");
                          }

                          @Override
                          public Map<String, Object> getExtraAttributeMap() {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public Object getExtraAttribute(String key) {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public String getExt() {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public IDataSource getDataSource() {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public Date getCreationDate() {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public HashSet<String> getCategorySet() {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public BufferedInputStream getBufferedStream() throws IOException {
                              // TODO Auto-generated method stub
                              return null;
                          }

                          @Override
                          public Date getAccessDate() {
                              // TODO Auto-generated method stub
                              return null;
                          }
                      };
                  }

                  @Override
                  public boolean containsAll(Collection<?> c) {
                      // TODO Auto-generated method stub
                      return false;
                  }

                  @Override
                  public boolean contains(Object o) {
                      // TODO Auto-generated method stub
                      return false;
                  }

                  @Override
                  public void clear() {
                      // TODO Auto-generated method stub

                  }

                  @Override
                  public boolean addAll(int index, Collection<? extends IItemBase> c) {
                      // TODO Auto-generated method stub
                      return false;
                  }

                  @Override
                  public boolean addAll(Collection<? extends IItemBase> c) {
                      // TODO Auto-generated method stub
                      return false;
                  }

                  @Override
                  public void add(int index, IItemBase element) {
                      // TODO Auto-generated method stub

                  }

                  @Override
                  public boolean add(IItemBase e) {
                      // TODO Auto-generated method stub
                      return false;
                  }
              };
          }

          @Override
          public String escapeQuery(String string) {
              // TODO Auto-generated method stub
              return string;
          }
      };
      ItemInfo itemInfo = new ItemInfo(0, getName(), null, null, getName(), false);
      context.set(ItemInfo.class, itemInfo);
      context.set(IItemSearcher.class, itemSearcher);
      parser.setExtractMessages(true);
      parser.setMergeDbs(false);
      parser.getSupportedTypes(context);
//      parser.parse(stream, handler, metadata, context);
  }

    
}
